package p294l3;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: l3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C23258i implements ContentHandler {

    /* JADX INFO: renamed from: w */
    public final ContentHandler f92142w;

    /* JADX INFO: renamed from: x */
    public final Editable f92143x;

    /* JADX INFO: renamed from: y */
    public int f92144y;

    /* JADX INFO: renamed from: z */
    public C23266m f92145z;

    public C23258i(ContentHandler contentHandler, Editable editable) {
        this.f92142w = contentHandler;
        this.f92143x = editable;
    }

    /* JADX INFO: renamed from: a */
    public final void m67321a() {
        C23266m c23266m = this.f92145z;
        if (c23266m != null) {
            int i13 = c23266m.f92190c;
            Editable editable = this.f92143x;
            editable.setSpan(c23266m, i13, editable.length(), 33);
        }
        this.f92145z = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i13, int i14) throws SAXException {
        this.f92142w.characters(cArr, i13, i14);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f92142w.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m67321a();
                        this.f92144y--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m67321a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.f92143x;
                Object[] spans = editable.getSpans(0, editable.length(), C23260j.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((C23260j) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    C23260j c23260j = (C23260j) arrayList.get(i13);
                    int spanStart = editable.getSpanStart(c23260j);
                    int length = editable.length();
                    editable.removeSpan(c23260j);
                    if (spanStart != length) {
                        editable.setSpan(c23260j, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f92142w.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f92142w.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i13, int i14) throws SAXException {
        this.f92142w.ignorableWhitespace(cArr, i13, i14);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f92142w.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f92142w.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f92142w.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f92142w.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.f92143x;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m67321a();
                        this.f92144y++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m67321a();
                    this.f92145z = new C23266m(C23264l.f92161e, this.f92144y, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i13 = 0; i13 < length; i13++) {
                        String localName = attributes.getLocalName(i13);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i13);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new C23260j(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f92142w.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f92142w.startPrefixMapping(str, str2);
    }
}
