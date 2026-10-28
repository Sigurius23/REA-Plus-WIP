.class public final synthetic Lv41/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lh0/a4;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/e0;->w:Lbc3/c0;

    iput-object p2, p0, Lv41/e0;->x:Lp1/c1;

    iput-object p3, p0, Lv41/e0;->y:Lh0/a4;

    iput-object p4, p0, Lv41/e0;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lv41/e0;->z:Lp1/c1;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lv41/e0;->w:Lbc3/c0;

    iget-object v2, p0, Lv41/e0;->x:Lp1/c1;

    iget-object v3, p0, Lv41/e0;->y:Lh0/a4;

    invoke-static {v1, v2, v3, v0, p1}, Lv41/d0$d;->a(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
