package io.getstream.chat.android.p226ui.helper;

import android.util.Log;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;", "Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;", "<init>", "()V", "mimeTypesToIconResMap", "", "", "", "getIconRes", "mimeType", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MimeTypeIconProviderImpl implements MimeTypeIconProvider {
    private final Map<String, Integer> mimeTypesToIconResMap = AbstractC25247g0.m73990Y(new C23465k(MimeType.MIME_TYPE_PDF, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_pdf)), new C23465k(MimeType.MIME_TYPE_CSV, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_csv)), new C23465k(MimeType.MIME_TYPE_TAR, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_tar)), new C23465k("application/zip", Integer.valueOf(C19469R.drawable.stream_ui_ic_file_zip)), new C23465k(MimeType.MIME_TYPE_RAR, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_rar)), new C23465k(MimeType.MIME_TYPE_7Z, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_7z)), new C23465k(MimeType.MIME_TYPE_DOC, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_doc)), new C23465k(MimeType.MIME_TYPE_DOCX, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_docx)), new C23465k(MimeType.MIME_TYPE_TXT, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_txt)), new C23465k(MimeType.MIME_TYPE_RTF, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_rtf)), new C23465k(MimeType.MIME_TYPE_HTML, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_html)), new C23465k(MimeType.MIME_TYPE_MD, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_md)), new C23465k(MimeType.MIME_TYPE_ODT, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_odt)), new C23465k(MimeType.MIME_TYPE_XLS, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_xls)), new C23465k(MimeType.MIME_TYPE_XLSX, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_xlsx)), new C23465k(MimeType.MIME_TYPE_PPT, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_ppt)), new C23465k(MimeType.MIME_TYPE_PPTX, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_pptx)), new C23465k(MimeType.MIME_TYPE_MOV, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mov)), new C23465k(MimeType.MIME_TYPE_QUICKTIME, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mov)), new C23465k(MimeType.MIME_TYPE_VIDEO_QUICKTIME, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mov)), new C23465k(MimeType.MIME_TYPE_MP4, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mov)), new C23465k(MimeType.MIME_TYPE_VIDEO_MP4, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mp4)), new C23465k(MimeType.MIME_TYPE_AUDIO_MP4, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mp3)), new C23465k(MimeType.MIME_TYPE_M4A, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_m4a)), new C23465k(MimeType.MIME_TYPE_MP3, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_mp3)), new C23465k(MimeType.MIME_TYPE_AAC, Integer.valueOf(C19469R.drawable.stream_ui_ic_file_aac)));

    @Override // io.getstream.chat.android.p226ui.helper.MimeTypeIconProvider
    public final int getIconRes(String mimeType) {
        if (mimeType == null) {
            return C19469R.drawable.stream_ui_ic_file;
        }
        Log.d("MimeTypeIconProvider", "mimeType: ".concat(mimeType));
        Integer num = this.mimeTypesToIconResMap.get(mimeType);
        if (num != null) {
            return num.intValue();
        }
        if (AbstractC39414r.m125876U(mimeType, "audio", false)) {
            return C19469R.drawable.stream_ui_ic_file_audio_generic;
        }
        return AbstractC39414r.m125876U(mimeType, "video", false) ? C19469R.drawable.stream_ui_ic_file_video_generic : C19469R.drawable.stream_ui_ic_file;
    }
}
