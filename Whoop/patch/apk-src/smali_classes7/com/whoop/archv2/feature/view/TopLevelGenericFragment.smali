.class public final Lcom/whoop/archv2/feature/view/TopLevelGenericFragment;
.super Lcom/whoop/archv2/feature/view/GenericFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/feature/view/TopLevelGenericFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/view/TopLevelGenericFragment;",
        "Lcom/whoop/archv2/feature/view/GenericFragment;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onResume",
        "J",
        "a",
        "arch-v2_release"
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
.field public static final J:Lcom/whoop/archv2/feature/view/TopLevelGenericFragment$a;

.field public static final K:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/archv2/feature/view/TopLevelGenericFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/feature/view/TopLevelGenericFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/feature/view/TopLevelGenericFragment;->J:Lcom/whoop/archv2/feature/view/TopLevelGenericFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/feature/view/TopLevelGenericFragment;->K:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/GenericFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onResume()V
    .locals 0

    invoke-super {p0}, Lcom/whoop/archv2/feature/view/GenericFragment;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
