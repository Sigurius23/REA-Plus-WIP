package p294l3;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C23274q implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z4 || !AbstractC22676k.m65745e(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new C23258i(xMLReader.getContentHandler(), editable));
    }
}
