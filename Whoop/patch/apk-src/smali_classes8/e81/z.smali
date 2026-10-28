.class public final synthetic Le81/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Ld0/e;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ld0/e;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/z;->w:Ld0/e;

    iput-object p2, p0, Le81/z;->x:Lp1/c1;

    iput-object p3, p0, Le81/z;->y:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le81/z;->x:Lp1/c1;

    iget-object v1, p0, Le81/z;->y:Lp1/c1;

    iget-object v2, p0, Le81/z;->w:Ld0/e;

    invoke-static {v2, v0, v1}, Le81/d0;->f(Ld0/e;Lp1/c1;Lp1/c1;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
