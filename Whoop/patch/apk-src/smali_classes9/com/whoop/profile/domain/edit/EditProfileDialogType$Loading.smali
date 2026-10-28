.class public final Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/EditProfileDialogType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Loading"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;",
        "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;",
        "<init>",
        "()V",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;

    invoke-direct {v0}, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;-><init>()V

    sput-object v0, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
