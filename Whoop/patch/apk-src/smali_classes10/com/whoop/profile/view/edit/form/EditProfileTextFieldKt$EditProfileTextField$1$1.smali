.class final Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt;->EditProfileTextField-iQW2vr8(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;JZZLy81/e;JJJJJZILq3/g0;Lqz0/c;Lc93/m;Lu0/q0;IZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V
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
.field public static final INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;

    invoke-direct {v0}, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;-><init>()V

    sput-object v0, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt$EditProfileTextField$1$1;->invoke-vNxB06k(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method

.method public final invoke-vNxB06k(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly81/i;->b()J

    move-result-wide v0

    return-wide v0
.end method
