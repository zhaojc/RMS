/**
 * 
 */
package com.jgefroh.rms.client.mvp.views.impls;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.jgefroh.rms.client.mvp.views.interfaces.Code404View;
import com.jgefroh.rms.client.mvp.views.interfaces.Code404View.Presenter;


/**
 * @author Joseph Gefroh
 */
public class Code404ViewImpl extends Composite implements Code404View {


    //////////////////////////////////////////////////
    // Interfaces
    //////////////////////////////////////////////////
    
    interface Code404ViewImplUiBinder extends UiBinder<Widget, Code404ViewImpl> {}
    private static Code404ViewImplUiBinder uiBinder = GWT.create(Code404ViewImplUiBinder.class);
    
    //////////////////////////////////////////////////
    // Fields - UI
    //////////////////////////////////////////////////
    
    //////////////////////////////////////////////////
    // Fields
    //////////////////////////////////////////////////
    
    private Presenter presenter;
    
    
    //////////////////////////////////////////////////
    // Constructors
    //////////////////////////////////////////////////
    
    public Code404ViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }


    //////////////////////////////////////////////////
    // Methods - Event Handlers
    //////////////////////////////////////////////////

    //////////////////////////////////////////////////
    // Methods - Interface Overrides
    //////////////////////////////////////////////////
    
    @Override
    public void setPresenter(final Presenter presenter) {
        this.presenter = presenter;
    }
    
    //////////////////////////////////////////////////
    // Methods - Helpers
    //////////////////////////////////////////////////
    //////////////////////////////////////////////////
    // Methods - Initialization
    //////////////////////////////////////////////////
}
