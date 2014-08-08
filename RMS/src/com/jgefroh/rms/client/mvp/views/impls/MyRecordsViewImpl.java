/**
 * 
 */
package com.jgefroh.rms.client.mvp.views.impls;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.jgefroh.rms.client.mvp.models.RecordVO;
import com.jgefroh.rms.client.mvp.views.interfaces.MyRecordsView;
import com.jgefroh.rms.client.navigation.places.CreatePurchaseOrderRecordPlace;


/**
 * @author Joseph Gefroh
 */
public class MyRecordsViewImpl extends Composite implements MyRecordsView {

    //////////////////////////////////////////////////
    // Interfaces
    //////////////////////////////////////////////////
    
    interface MyRecordsViewImplUiBinder extends UiBinder<Widget, MyRecordsViewImpl> {}
    private static MyRecordsViewImplUiBinder uiBinder = GWT.create(MyRecordsViewImplUiBinder.class);
    
    
    //////////////////////////////////////////////////
    // Fields - UI
    //////////////////////////////////////////////////

    @UiField CellTable<RecordVO> myRecordsTable;
    
    
    //////////////////////////////////////////////////
    // Fields
    //////////////////////////////////////////////////
    
    private Presenter presenter;
    
    
    //////////////////////////////////////////////////
    // Constructors
    //////////////////////////////////////////////////
    
    public MyRecordsViewImpl() {
        initBookRecordsTable();
        initWidget(uiBinder.createAndBindUi(this));
    }


    //////////////////////////////////////////////////
    // Methods - Event Handlers
    //////////////////////////////////////////////////

    @UiHandler("btnCreate")
    void onCreateClicked(final ClickEvent event) {
        presenter.goTo(new CreatePurchaseOrderRecordPlace());
    }
    
    
    //////////////////////////////////////////////////
    // Methods - Interface Overrides
    //////////////////////////////////////////////////
    
    @Override
    public void setPresenter(final Presenter presenter) {
        this.presenter = presenter;
    }
    

    //////////////////////////////////////////////////
    // Methods - Initialization
    //////////////////////////////////////////////////
    
    private void initBookRecordsTable() {
    }

    @Override
    public void showRecords(final List<RecordVO> records) {
    }
}
