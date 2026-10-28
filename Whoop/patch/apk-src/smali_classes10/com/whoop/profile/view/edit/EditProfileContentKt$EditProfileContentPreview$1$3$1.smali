.class final Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
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
.field public static final INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;

    invoke-direct {v0}, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;-><init>()V

    sput-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;->invoke(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
