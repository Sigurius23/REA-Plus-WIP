.class final Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/EditProfileContentKt;->EditProfileContentPreview(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;

    invoke-direct {v0}, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;-><init>()V

    sput-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;

    invoke-virtual {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;->invoke(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
