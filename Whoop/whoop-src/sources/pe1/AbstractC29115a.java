package pe1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.FeatureEducationScreenDto;
import com.whoop.educationModels.MediaHeader;
import com.whoop.educationModels.NavBarDto;
import com.whoop.educationModels.OperatingSystem;
import com.whoop.educationModels.PodcastPicker;
import com.whoop.educationModels.PodcastPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pe1.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", "Lcom/whoop/design/util/TextResource;", "b", "(Ljava/util/List;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/educationModels/MediaHeader;", "a", "(Lcom/whoop/educationModels/MediaHeader;)Lcom/whoop/educationModels/MediaHeader;", "education_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29115a {
    /* JADX INFO: renamed from: a */
    public static final MediaHeader m88475a(MediaHeader mediaHeader) {
        List arrayList;
        List<PodcastPlayer> podcastPlayers;
        AbstractC22676k.m65750j(mediaHeader, "<this>");
        PodcastPicker podcastPicker = mediaHeader.getPodcastPicker();
        PodcastPicker podcastPickerCopy$default = null;
        if (podcastPicker != null) {
            PodcastPicker podcastPicker2 = mediaHeader.getPodcastPicker();
            if (podcastPicker2 == null || (podcastPlayers = podcastPicker2.getPodcastPlayers()) == null) {
                arrayList = C25271y.f99162w;
            } else {
                arrayList = new ArrayList();
                for (Object obj : podcastPlayers) {
                    PodcastPlayer podcastPlayer = (PodcastPlayer) obj;
                    if (podcastPlayer.getOperatingSystem() == OperatingSystem.ANDROID || podcastPlayer.getOperatingSystem() == OperatingSystem.BOTH) {
                        arrayList.add(obj);
                    }
                }
            }
            podcastPickerCopy$default = PodcastPicker.copy$default(podcastPicker, null, arrayList, 1, null);
        }
        return MediaHeader.copy$default(mediaHeader, null, null, null, false, null, podcastPickerCopy$default, null, 95, null);
    }

    /* JADX INFO: renamed from: b */
    public static final TextResource m88476b(List<FeatureEducationScreenDto> list) {
        Object next;
        NavBarDto navBar;
        String title;
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(list, "<this>");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((FeatureEducationScreenDto) next).getNavBar() == null);
        FeatureEducationScreenDto featureEducationScreenDto = (FeatureEducationScreenDto) next;
        return (featureEducationScreenDto == null || (navBar = featureEducationScreenDto.getNavBar()) == null || (title = navBar.getTitle()) == null || (textResourceM21278l = AbstractC8693b.m21278l(title)) == null) ? AbstractC8693b.m21267a() : textResourceM21278l;
    }
}
