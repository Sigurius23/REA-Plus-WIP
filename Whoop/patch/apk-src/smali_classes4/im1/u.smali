.class public final synthetic Lim1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic x:F

.field public final synthetic y:Landroid/os/LocaleList;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;FLandroid/os/LocaleList;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/u;->w:Lcom/whoop/home/view/HomeFragment;

    iput p2, p0, Lim1/u;->x:F

    iput-object p3, p0, Lim1/u;->y:Landroid/os/LocaleList;

    iput-object p4, p0, Lim1/u;->z:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lim1/u;->z:Lp1/t2;

    check-cast p1, Lfm1/g;

    iget-object v1, p0, Lim1/u;->w:Lcom/whoop/home/view/HomeFragment;

    iget v2, p0, Lim1/u;->x:F

    iget-object v3, p0, Lim1/u;->y:Landroid/os/LocaleList;

    invoke-static {v1, v2, v3, v0, p1}, Lcom/whoop/home/view/HomeFragment;->q0(Lcom/whoop/home/view/HomeFragment;FLandroid/os/LocaleList;Lp1/t2;Lfm1/g;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
