package com.whoop.design.models;

import com.whoop.analytics.AnalyticEventModel;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0002¨\u0006\u0007"}, m65681d2 = {"applyBindings", "Lcom/whoop/analytics/AnalyticEventModel;", "bindings", "", "", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignModelWrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AnalyticEventModel applyBindings(AnalyticEventModel analyticEventModel, Map<String, String> map, Map<String, ? extends Object> map2) {
        if (map.isEmpty()) {
            return analyticEventModel;
        }
        String name = analyticEventModel.getName();
        String category = analyticEventModel.getCategory();
        String source = analyticEventModel.getSource();
        String action = analyticEventModel.getAction();
        String label = analyticEventModel.getLabel();
        String value = analyticEventModel.getValue();
        String str = name;
        String str2 = category;
        String str3 = source;
        String str4 = action;
        String str5 = label;
        String str6 = value;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Object obj = map2.get(entry.getValue());
            String str7 = obj instanceof String ? (String) obj : null;
            if (str7 != null) {
                switch (key.hashCode()) {
                    case -1422950858:
                        if (key.equals("action")) {
                            str4 = str7;
                        }
                        break;
                    case -896505829:
                        if (key.equals("source")) {
                            str3 = str7;
                        }
                        break;
                    case 3373707:
                        if (key.equals("name")) {
                            str = str7;
                        }
                        break;
                    case 50511102:
                        if (key.equals("category")) {
                            str2 = str7;
                        }
                        break;
                    case 102727412:
                        if (key.equals("label")) {
                            str5 = str7;
                        }
                        break;
                    case 111972721:
                        if (key.equals("value")) {
                            str6 = str7;
                        }
                        break;
                }
            }
        }
        return AnalyticEventModel.copy$default(analyticEventModel, str, str2, str3, str4, str5, str6, null, 64, null);
    }
}
