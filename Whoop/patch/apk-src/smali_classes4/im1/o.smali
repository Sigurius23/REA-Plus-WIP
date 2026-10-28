.class public final synthetic Lim1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic x:F

.field public final synthetic y:Landroid/os/LocaleList;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;FLandroid/os/LocaleList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/o;->w:Lcom/whoop/home/view/HomeFragment;

    iput p2, p0, Lim1/o;->x:F

    iput-object p3, p0, Lim1/o;->y:Landroid/os/LocaleList;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lim1/o;->w:Lcom/whoop/home/view/HomeFragment;

    iget v1, p0, Lim1/o;->x:F

    iget-object v2, p0, Lim1/o;->y:Landroid/os/LocaleList;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/home/view/HomeFragment;->p0(Lcom/whoop/home/view/HomeFragment;FLandroid/os/LocaleList;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
