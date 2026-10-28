.class public final Luz/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic w:Lec3/l;

.field public final synthetic x:Luz/o;

.field public final synthetic y:Landroidx/fragment/app/r0;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/h2;Luz/o;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz/m;->w:Lec3/l;

    iput-object p2, p0, Luz/m;->x:Luz/o;

    iput-object p3, p0, Luz/m;->y:Landroidx/fragment/app/r0;

    iput-object p4, p0, Luz/m;->z:Ljava/lang/String;

    iput-object p5, p0, Luz/m;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Luz/l;

    iget-object v4, p0, Luz/m;->z:Ljava/lang/String;

    iget-object v5, p0, Luz/m;->E:Ljava/lang/String;

    iget-object v2, p0, Luz/m;->x:Luz/o;

    iget-object v3, p0, Luz/m;->y:Landroidx/fragment/app/r0;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Luz/l;-><init>(Lec3/m;Luz/o;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Luz/m;->w:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
