.class public final Lcom/whoop/profile/view/ProfileAvatarKt$ProfileAvatarWithImagePreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatarWithImagePreview(Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileAvatarKt$ProfileAvatarWithImagePreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, -0x773e18bc

    .line 2
    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    .line 3
    new-instance v3, Lkd1/o$a;

    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-virtual {p1}, Lx81/d;->d()Lgz0/o0;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/o0;->i()Lgz0/w;

    move-result-object p1

    invoke-virtual {p1}, Lgz0/w;->v()I

    move-result p1

    invoke-direct {v3, p1}, Lkd1/o$a;-><init>(I)V

    sget v7, Lkd1/o$a;->c:I

    const/4 v8, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 4
    invoke-static/range {v3 .. v8}, Lcom/whoop/profile/view/ProfileAvatarKt;->ProfileAvatar(Lkd1/o;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 5
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    return-void
.end method
