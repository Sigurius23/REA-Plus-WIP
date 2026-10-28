.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

.field public final synthetic x:I

.field public final synthetic y:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->x:I

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->y:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->x:I

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->y:Landroid/content/Context;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/b;->w:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->C(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;ILandroid/content/Context;Landroid/view/View;IIIIIIII)V

    return-void
.end method
