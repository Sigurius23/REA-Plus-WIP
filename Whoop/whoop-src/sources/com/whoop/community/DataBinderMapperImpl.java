package com.whoop.community;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import androidx.health.platform.client.proto.C1533u;
import eq0.C13437a0;
import eq0.C13438a1;
import eq0.C13439a2;
import eq0.C13441b;
import eq0.C13445b3;
import eq0.C13447c0;
import eq0.C13448c1;
import eq0.C13449c2;
import eq0.C13451d;
import eq0.C13455d3;
import eq0.C13457e0;
import eq0.C13458e1;
import eq0.C13459e2;
import eq0.C13461f;
import eq0.C13465f3;
import eq0.C13467g0;
import eq0.C13468g1;
import eq0.C13471h;
import eq0.C13474h2;
import eq0.C13475h3;
import eq0.C13477i0;
import eq0.C13478i1;
import eq0.C13481j;
import eq0.C13484j2;
import eq0.C13485j3;
import eq0.C13487k0;
import eq0.C13488k1;
import eq0.C13491l;
import eq0.C13494l2;
import eq0.C13495l3;
import eq0.C13497m0;
import eq0.C13498m1;
import eq0.C13501n;
import eq0.C13504n2;
import eq0.C13505n3;
import eq0.C13507o0;
import eq0.C13508o1;
import eq0.C13514p2;
import eq0.C13515p3;
import eq0.C13516q;
import eq0.C13517q0;
import eq0.C13518q1;
import eq0.C13524r2;
import eq0.C13525r3;
import eq0.C13526s;
import eq0.C13527s0;
import eq0.C13528s1;
import eq0.C13534t2;
import eq0.C13535t3;
import eq0.C13536u;
import eq0.C13537u0;
import eq0.C13538u1;
import eq0.C13544v2;
import eq0.C13545v3;
import eq0.C13546w;
import eq0.C13547w0;
import eq0.C13548w1;
import eq0.C13553x2;
import eq0.C13554y;
import eq0.C13555y0;
import eq0.C13556y1;
import eq0.C13561z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;
import xp0.AbstractC38501b0;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f24937a;

    /* JADX INFO: renamed from: com.whoop.community.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes7.dex */
    public static class C6308a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f24938a;

        static {
            HashMap<String, Integer> map = new HashMap<>(62);
            f24938a = map;
            map.put("layout/activity_create_team_0", Integer.valueOf(AbstractC38501b0.f165505a));
            map.put("layout/activity_invite_code_0", Integer.valueOf(AbstractC38501b0.f165507b));
            map.put("layout/activity_invite_code_confirmation_0", Integer.valueOf(AbstractC38501b0.f165509c));
            map.put("layout/activity_join_team_landing_0", Integer.valueOf(AbstractC38501b0.f165515f));
            map.put("layout/activity_team_remove_members_0", Integer.valueOf(AbstractC38501b0.f165517g));
            map.put("layout/activity_teams_show_invite_0", Integer.valueOf(AbstractC38501b0.f165519h));
            map.put("layout/category_item_view_0", Integer.valueOf(AbstractC38501b0.f165523j));
            map.put("layout/chat_image_view_0", Integer.valueOf(AbstractC38501b0.f165527l));
            map.put("layout/chat_reaction_view_0", Integer.valueOf(AbstractC38501b0.f165529m));
            map.put("layout/chat_report_settings_0", Integer.valueOf(AbstractC38501b0.f165531n));
            map.put("layout/chat_rich_text_link_view_0", Integer.valueOf(AbstractC38501b0.f165533o));
            map.put("layout/chat_try_again_0", Integer.valueOf(AbstractC38501b0.f165535p));
            map.put("layout/community_landing_rank_settings_0", Integer.valueOf(AbstractC38501b0.f165541s));
            map.put("layout/community_pending_invite_item_view_0", Integer.valueOf(AbstractC38501b0.f165545u));
            map.put("layout/compose_message_menu_0", Integer.valueOf(AbstractC38501b0.f165547v));
            map.put("layout/compose_messages_0", Integer.valueOf(AbstractC38501b0.f165549w));
            map.put("layout/custom_mention_item_layout_0", Integer.valueOf(AbstractC38501b0.f165553y));
            map.put("layout/custom_message_item_layout_0", Integer.valueOf(AbstractC38501b0.f165555z));
            map.put("layout/data_widget_item_view_0", Integer.valueOf(AbstractC38501b0.f165474A));
            map.put("layout/fragment_chat_0", Integer.valueOf(AbstractC38501b0.f165476B));
            map.put("layout/fragment_community_0", Integer.valueOf(AbstractC38501b0.f165478C));
            map.put("layout/fragment_community_landing_0", Integer.valueOf(AbstractC38501b0.f165480D));
            map.put("layout/fragment_community_landing_toolbar_0", Integer.valueOf(AbstractC38501b0.f165482E));
            map.put("layout/fragment_community_landing_toolbarv1_0", Integer.valueOf(AbstractC38501b0.f165484F));
            map.put("layout/fragment_community_pending_0", Integer.valueOf(AbstractC38501b0.f165485G));
            map.put("layout/fragment_data_widget_0", Integer.valueOf(AbstractC38501b0.f165486H));
            map.put("layout/fragment_global_share_button_0", Integer.valueOf(AbstractC38501b0.f165487I));
            map.put("layout/fragment_global_share_dialog_0", Integer.valueOf(AbstractC38501b0.f165488J));
            map.put("layout/fragment_manage_team_0", Integer.valueOf(AbstractC38501b0.f165489K));
            map.put("layout/fragment_notification_settings_0", Integer.valueOf(AbstractC38501b0.f165490L));
            map.put("layout/fragment_select_team_0", Integer.valueOf(AbstractC38501b0.f165491M));
            map.put("layout/fragment_team_addmembers_0", Integer.valueOf(AbstractC38501b0.f165492N));
            map.put("layout/fragment_team_create_banner_0", Integer.valueOf(AbstractC38501b0.f165493O));
            map.put("layout/fragment_team_create_logo_0", Integer.valueOf(AbstractC38501b0.f165494P));
            map.put("layout/fragment_team_create_name_0", Integer.valueOf(AbstractC38501b0.f165495Q));
            map.put("layout/fragment_team_create_sharing_0", Integer.valueOf(AbstractC38501b0.f165496R));
            map.put("layout/fragment_team_remove_members_0", Integer.valueOf(AbstractC38501b0.f165498T));
            map.put("layout/fragment_teams_board_v1_0", Integer.valueOf(AbstractC38501b0.f165499U));
            map.put("layout/fragment_teams_overview_0", Integer.valueOf(AbstractC38501b0.f165500V));
            map.put("layout/fragment_teams_show_invite_0", Integer.valueOf(AbstractC38501b0.f165501W));
            map.put("layout/granular_notification_layout_0", Integer.valueOf(AbstractC38501b0.f165502X));
            map.put("layout/layout_data_widget_error_state_0", Integer.valueOf(AbstractC38501b0.f165510c0));
            map.put("layout/layout_global_share_error_state_0", Integer.valueOf(AbstractC38501b0.f165512d0));
            map.put("layout/layout_select_team_empty_0", Integer.valueOf(AbstractC38501b0.f165514e0));
            map.put("layout/layout_team_pick_image_0", Integer.valueOf(AbstractC38501b0.f165516f0));
            map.put("layout/layout_team_pick_logo_0", Integer.valueOf(AbstractC38501b0.f165518g0));
            map.put("layout/layout_teams_header_v1_0", Integer.valueOf(AbstractC38501b0.f165520h0));
            map.put("layout/layout_teams_overview_header_0", Integer.valueOf(AbstractC38501b0.f165522i0));
            map.put("layout/leaderboard_setting_0", Integer.valueOf(AbstractC38501b0.f165524j0));
            map.put("layout/member_story_layout_0", Integer.valueOf(AbstractC38501b0.f165532n0));
            map.put("layout/message_actions_0", Integer.valueOf(AbstractC38501b0.f165534o0));
            map.put("layout/message_item_delete_view_0", Integer.valueOf(AbstractC38501b0.f165536p0));
            map.put("layout/message_reply_item_view_0", Integer.valueOf(AbstractC38501b0.f165538q0));
            map.put("layout/select_team_item_view_0", Integer.valueOf(AbstractC38501b0.f165540r0));
            map.put("layout/selected_attachment_item_media_0", Integer.valueOf(AbstractC38501b0.f165542s0));
            map.put("layout/stream_empty_state_view_0", Integer.valueOf(AbstractC38501b0.f165548v0));
            map.put("layout/view_create_team_and_invite_code_button_layout_0", Integer.valueOf(AbstractC38501b0.f165550w0));
            map.put("layout/view_create_team_and_invite_code_button_layoutv1_0", Integer.valueOf(AbstractC38501b0.f165552x0));
            map.put("layout/view_create_team_and_invite_code_prompt_cardv1_0", Integer.valueOf(AbstractC38501b0.f165554y0));
            map.put("layout/view_drag_and_zoom_0", Integer.valueOf(AbstractC38501b0.f165556z0));
            map.put("layout/view_team_leaderboard_toggle_0", Integer.valueOf(AbstractC38501b0.f165477B0));
            map.put("layout/widget_item_view_0", Integer.valueOf(AbstractC38501b0.f165483E0));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(62);
        f24937a = sparseIntArray;
        sparseIntArray.put(AbstractC38501b0.f165505a, 1);
        sparseIntArray.put(AbstractC38501b0.f165507b, 2);
        sparseIntArray.put(AbstractC38501b0.f165509c, 3);
        sparseIntArray.put(AbstractC38501b0.f165515f, 4);
        sparseIntArray.put(AbstractC38501b0.f165517g, 5);
        sparseIntArray.put(AbstractC38501b0.f165519h, 6);
        sparseIntArray.put(AbstractC38501b0.f165523j, 7);
        sparseIntArray.put(AbstractC38501b0.f165527l, 8);
        sparseIntArray.put(AbstractC38501b0.f165529m, 9);
        sparseIntArray.put(AbstractC38501b0.f165531n, 10);
        sparseIntArray.put(AbstractC38501b0.f165533o, 11);
        sparseIntArray.put(AbstractC38501b0.f165535p, 12);
        sparseIntArray.put(AbstractC38501b0.f165541s, 13);
        sparseIntArray.put(AbstractC38501b0.f165545u, 14);
        sparseIntArray.put(AbstractC38501b0.f165547v, 15);
        sparseIntArray.put(AbstractC38501b0.f165549w, 16);
        sparseIntArray.put(AbstractC38501b0.f165553y, 17);
        sparseIntArray.put(AbstractC38501b0.f165555z, 18);
        sparseIntArray.put(AbstractC38501b0.f165474A, 19);
        sparseIntArray.put(AbstractC38501b0.f165476B, 20);
        sparseIntArray.put(AbstractC38501b0.f165478C, 21);
        sparseIntArray.put(AbstractC38501b0.f165480D, 22);
        sparseIntArray.put(AbstractC38501b0.f165482E, 23);
        sparseIntArray.put(AbstractC38501b0.f165484F, 24);
        sparseIntArray.put(AbstractC38501b0.f165485G, 25);
        sparseIntArray.put(AbstractC38501b0.f165486H, 26);
        sparseIntArray.put(AbstractC38501b0.f165487I, 27);
        sparseIntArray.put(AbstractC38501b0.f165488J, 28);
        sparseIntArray.put(AbstractC38501b0.f165489K, 29);
        sparseIntArray.put(AbstractC38501b0.f165490L, 30);
        sparseIntArray.put(AbstractC38501b0.f165491M, 31);
        sparseIntArray.put(AbstractC38501b0.f165492N, 32);
        sparseIntArray.put(AbstractC38501b0.f165493O, 33);
        sparseIntArray.put(AbstractC38501b0.f165494P, 34);
        sparseIntArray.put(AbstractC38501b0.f165495Q, 35);
        sparseIntArray.put(AbstractC38501b0.f165496R, 36);
        sparseIntArray.put(AbstractC38501b0.f165498T, 37);
        sparseIntArray.put(AbstractC38501b0.f165499U, 38);
        sparseIntArray.put(AbstractC38501b0.f165500V, 39);
        sparseIntArray.put(AbstractC38501b0.f165501W, 40);
        sparseIntArray.put(AbstractC38501b0.f165502X, 41);
        sparseIntArray.put(AbstractC38501b0.f165510c0, 42);
        sparseIntArray.put(AbstractC38501b0.f165512d0, 43);
        sparseIntArray.put(AbstractC38501b0.f165514e0, 44);
        sparseIntArray.put(AbstractC38501b0.f165516f0, 45);
        sparseIntArray.put(AbstractC38501b0.f165518g0, 46);
        sparseIntArray.put(AbstractC38501b0.f165520h0, 47);
        sparseIntArray.put(AbstractC38501b0.f165522i0, 48);
        sparseIntArray.put(AbstractC38501b0.f165524j0, 49);
        sparseIntArray.put(AbstractC38501b0.f165532n0, 50);
        sparseIntArray.put(AbstractC38501b0.f165534o0, 51);
        sparseIntArray.put(AbstractC38501b0.f165536p0, 52);
        sparseIntArray.put(AbstractC38501b0.f165538q0, 53);
        sparseIntArray.put(AbstractC38501b0.f165540r0, 54);
        sparseIntArray.put(AbstractC38501b0.f165542s0, 55);
        sparseIntArray.put(AbstractC38501b0.f165548v0, 56);
        sparseIntArray.put(AbstractC38501b0.f165550w0, 57);
        sparseIntArray.put(AbstractC38501b0.f165552x0, 58);
        sparseIntArray.put(AbstractC38501b0.f165554y0, 59);
        sparseIntArray.put(AbstractC38501b0.f165556z0, 60);
        sparseIntArray.put(AbstractC38501b0.f165477B0, 61);
        sparseIntArray.put(AbstractC38501b0.f165483E0, 62);
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC1168a0 m19183a(InterfaceC1176f interfaceC1176f, View view, int i13, Object obj) {
        switch (i13) {
            case 1:
                if ("layout/activity_create_team_0".equals(obj)) {
                    return new C13441b(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_create_team is invalid. Received: "));
            case 2:
                if ("layout/activity_invite_code_0".equals(obj)) {
                    return new C13451d(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_invite_code is invalid. Received: "));
            case 3:
                if ("layout/activity_invite_code_confirmation_0".equals(obj)) {
                    return new C13461f(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_invite_code_confirmation is invalid. Received: "));
            case 4:
                if ("layout/activity_join_team_landing_0".equals(obj)) {
                    return new C13471h(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_join_team_landing is invalid. Received: "));
            case 5:
                if ("layout/activity_team_remove_members_0".equals(obj)) {
                    return new C13481j(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_team_remove_members is invalid. Received: "));
            case 6:
                if ("layout/activity_teams_show_invite_0".equals(obj)) {
                    return new C13491l(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for activity_teams_show_invite is invalid. Received: "));
            case 7:
                if ("layout/category_item_view_0".equals(obj)) {
                    return new C13501n(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for category_item_view is invalid. Received: "));
            case 8:
                if ("layout/chat_image_view_0".equals(obj)) {
                    return new C13516q(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for chat_image_view is invalid. Received: "));
            case 9:
                if ("layout/chat_reaction_view_0".equals(obj)) {
                    return new C13526s(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for chat_reaction_view is invalid. Received: "));
            case 10:
                if ("layout/chat_report_settings_0".equals(obj)) {
                    return new C13536u(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for chat_report_settings is invalid. Received: "));
            case 11:
                if ("layout/chat_rich_text_link_view_0".equals(obj)) {
                    return new C13546w(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for chat_rich_text_link_view is invalid. Received: "));
            case 12:
                if ("layout/chat_try_again_0".equals(obj)) {
                    return new C13554y(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for chat_try_again is invalid. Received: "));
            case 13:
                if ("layout/community_landing_rank_settings_0".equals(obj)) {
                    return new C13437a0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for community_landing_rank_settings is invalid. Received: "));
            case 14:
                if ("layout/community_pending_invite_item_view_0".equals(obj)) {
                    return new C13447c0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for community_pending_invite_item_view is invalid. Received: "));
            case 15:
                if ("layout/compose_message_menu_0".equals(obj)) {
                    return new C13457e0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for compose_message_menu is invalid. Received: "));
            case 16:
                if ("layout/compose_messages_0".equals(obj)) {
                    return new C13467g0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for compose_messages is invalid. Received: "));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if ("layout/custom_mention_item_layout_0".equals(obj)) {
                    return new C13477i0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for custom_mention_item_layout is invalid. Received: "));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if ("layout/custom_message_item_layout_0".equals(obj)) {
                    return new C13487k0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for custom_message_item_layout is invalid. Received: "));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if ("layout/data_widget_item_view_0".equals(obj)) {
                    return new C13497m0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for data_widget_item_view is invalid. Received: "));
            case 20:
                if ("layout/fragment_chat_0".equals(obj)) {
                    return new C13507o0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_chat is invalid. Received: "));
            case 21:
                if ("layout/fragment_community_0".equals(obj)) {
                    return new C13517q0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_community is invalid. Received: "));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                if ("layout/fragment_community_landing_0".equals(obj)) {
                    return new C13527s0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_community_landing is invalid. Received: "));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                if ("layout/fragment_community_landing_toolbar_0".equals(obj)) {
                    return new C13537u0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_community_landing_toolbar is invalid. Received: "));
            case 24:
                if ("layout/fragment_community_landing_toolbarv1_0".equals(obj)) {
                    return new C13547w0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_community_landing_toolbarv1 is invalid. Received: "));
            case 25:
                if ("layout/fragment_community_pending_0".equals(obj)) {
                    return new C13555y0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_community_pending is invalid. Received: "));
            case 26:
                if ("layout/fragment_data_widget_0".equals(obj)) {
                    return new C13438a1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_data_widget is invalid. Received: "));
            case 27:
                if ("layout/fragment_global_share_button_0".equals(obj)) {
                    return new C13448c1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_global_share_button is invalid. Received: "));
            case 28:
                if ("layout/fragment_global_share_dialog_0".equals(obj)) {
                    return new C13458e1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_global_share_dialog is invalid. Received: "));
            case 29:
                if ("layout/fragment_manage_team_0".equals(obj)) {
                    return new C13468g1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_manage_team is invalid. Received: "));
            case 30:
                if ("layout/fragment_notification_settings_0".equals(obj)) {
                    return new C13478i1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_notification_settings is invalid. Received: "));
            case 31:
                if ("layout/fragment_select_team_0".equals(obj)) {
                    return new C13488k1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_select_team is invalid. Received: "));
            case 32:
                if ("layout/fragment_team_addmembers_0".equals(obj)) {
                    return new C13498m1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_addmembers is invalid. Received: "));
            case 33:
                if ("layout/fragment_team_create_banner_0".equals(obj)) {
                    return new C13508o1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_create_banner is invalid. Received: "));
            case 34:
                if ("layout/fragment_team_create_logo_0".equals(obj)) {
                    return new C13518q1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_create_logo is invalid. Received: "));
            case 35:
                if ("layout/fragment_team_create_name_0".equals(obj)) {
                    return new C13528s1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_create_name is invalid. Received: "));
            case 36:
                if ("layout/fragment_team_create_sharing_0".equals(obj)) {
                    return new C13538u1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_create_sharing is invalid. Received: "));
            case 37:
                if ("layout/fragment_team_remove_members_0".equals(obj)) {
                    return new C13548w1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_team_remove_members is invalid. Received: "));
            case 38:
                if ("layout/fragment_teams_board_v1_0".equals(obj)) {
                    return new C13556y1(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_teams_board_v1 is invalid. Received: "));
            case 39:
                if ("layout/fragment_teams_overview_0".equals(obj)) {
                    return new C13439a2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_teams_overview is invalid. Received: "));
            case 40:
                if ("layout/fragment_teams_show_invite_0".equals(obj)) {
                    return new C13449c2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for fragment_teams_show_invite is invalid. Received: "));
            case 41:
                if ("layout/granular_notification_layout_0".equals(obj)) {
                    return new C13459e2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for granular_notification_layout is invalid. Received: "));
            case 42:
                if ("layout/layout_data_widget_error_state_0".equals(obj)) {
                    return new C13474h2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_data_widget_error_state is invalid. Received: "));
            case 43:
                if ("layout/layout_global_share_error_state_0".equals(obj)) {
                    return new C13484j2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_global_share_error_state is invalid. Received: "));
            case 44:
                if ("layout/layout_select_team_empty_0".equals(obj)) {
                    return new C13494l2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_select_team_empty is invalid. Received: "));
            case 45:
                if ("layout/layout_team_pick_image_0".equals(obj)) {
                    return new C13504n2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_team_pick_image is invalid. Received: "));
            case 46:
                if ("layout/layout_team_pick_logo_0".equals(obj)) {
                    return new C13514p2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_team_pick_logo is invalid. Received: "));
            case 47:
                if ("layout/layout_teams_header_v1_0".equals(obj)) {
                    return new C13524r2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_teams_header_v1 is invalid. Received: "));
            case 48:
                if ("layout/layout_teams_overview_header_0".equals(obj)) {
                    return new C13534t2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for layout_teams_overview_header is invalid. Received: "));
            case 49:
                if ("layout/leaderboard_setting_0".equals(obj)) {
                    return new C13544v2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for leaderboard_setting is invalid. Received: "));
            case 50:
                if ("layout/member_story_layout_0".equals(obj)) {
                    return new C13553x2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for member_story_layout is invalid. Received: "));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC1168a0 m19184b(InterfaceC1176f interfaceC1176f, View view, int i13, Object obj) {
        switch (i13) {
            case 51:
                if ("layout/message_actions_0".equals(obj)) {
                    return new C13561z2(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for message_actions is invalid. Received: "));
            case 52:
                if ("layout/message_item_delete_view_0".equals(obj)) {
                    return new C13445b3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for message_item_delete_view is invalid. Received: "));
            case 53:
                if ("layout/message_reply_item_view_0".equals(obj)) {
                    return new C13455d3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for message_reply_item_view is invalid. Received: "));
            case 54:
                if ("layout/select_team_item_view_0".equals(obj)) {
                    return new C13465f3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for select_team_item_view is invalid. Received: "));
            case 55:
                if ("layout/selected_attachment_item_media_0".equals(obj)) {
                    return new C13475h3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for selected_attachment_item_media is invalid. Received: "));
            case 56:
                if ("layout/stream_empty_state_view_0".equals(obj)) {
                    return new C13485j3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for stream_empty_state_view is invalid. Received: "));
            case 57:
                if ("layout/view_create_team_and_invite_code_button_layout_0".equals(obj)) {
                    return new C13495l3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for view_create_team_and_invite_code_button_layout is invalid. Received: "));
            case 58:
                if ("layout/view_create_team_and_invite_code_button_layoutv1_0".equals(obj)) {
                    return new C13505n3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for view_create_team_and_invite_code_button_layoutv1 is invalid. Received: "));
            case 59:
                if ("layout/view_create_team_and_invite_code_prompt_cardv1_0".equals(obj)) {
                    return new C13515p3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for view_create_team_and_invite_code_prompt_cardv1 is invalid. Received: "));
            case 60:
                if ("layout/view_drag_and_zoom_0".equals(obj)) {
                    return new C13525r3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for view_drag_and_zoom is invalid. Received: "));
            case 61:
                if ("layout/view_team_leaderboard_toggle_0".equals(obj)) {
                    return new C13535t3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for view_team_leaderboard_toggle is invalid. Received: "));
            case 62:
                if ("layout/widget_item_view_0".equals(obj)) {
                    return new C13545v3(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "The tag for widget_item_view is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f24937a.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i15 = (i14 - 1) / 50;
        if (i15 == 0) {
            return m19183a(interfaceC1176f, view, i14, tag);
        }
        if (i15 != 1) {
            return null;
        }
        return m19184b(interfaceC1176f, view, i14, tag);
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C6308a.f24938a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || f24937a.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
