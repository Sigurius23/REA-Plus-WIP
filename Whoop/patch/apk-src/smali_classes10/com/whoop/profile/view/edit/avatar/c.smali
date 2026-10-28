.class public final synthetic Lcom/whoop/profile/view/edit/avatar/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lp1/z0;

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/avatar/c;->w:Lp1/z0;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/c;->x:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v2, p1

    check-cast v2, Lh2/b;

    move-object v3, p2

    check-cast v3, Lh2/b;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v4

    check-cast p4, Ljava/lang/Float;

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/c;->w:Lp1/z0;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/c;->x:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->a(Lp1/z0;Lp1/c1;Lh2/b;Lh2/b;FF)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
