package co.napoleon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LinksPage {

	public LinksPage() {
		super();
		
	}
	
	
	public static final Target IFRAME_LINK = Target.the("Open a link iframe test in home page")
            .locatedBy(("//tr//td//a[6][contains(text(),'IFrames Test')]"));
	
	public static final Target WINDOWS_OPEN_LINK = Target.the("Open a link new windows in iframe page")
            .locatedBy(("//table//td//a[8][contains(text(),'Window Open Test')]"));
	
	public static final Target TABLE_LINK = Target.the("Open a link new windows in iframe page")
            .locatedBy(("//table//td//a[3][contains(text(),'Table Test')]"));

}
