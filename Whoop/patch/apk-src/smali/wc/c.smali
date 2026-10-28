.class public final Lwc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final E:Lve/b;

.field public final w:Lvg/n;

.field public final x:Z

.field public final y:Lpf/a;

.field public final z:Lve/g;


# direct methods
.method public constructor <init>(Lpf/a;Ljava/lang/String;)V
    .locals 13

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lvg/m;->b:Lvg/r;

    const-string v0, "platformProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lwc/c;->w:Lvg/n;

    const/4 v0, 0x0

    const/4 v9, 0x1

    if-nez p1, :cond_0

    move v1, v9

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lwc/c;->x:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p1}, Lse/h;->Q(Lkotlin/jvm/functions/Function1;)Lrf/o;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lwc/c;->y:Lpf/a;

    new-instance v10, Lve/g;

    new-instance v11, Lwc/k1;

    new-instance v1, Landroidx/room/u;

    const/4 v7, 0x0

    const/16 v8, 0x17

    const/4 v2, 0x1

    const-class v4, Lvg/n;

    const-string v5, "getProperty"

    const-string v6, "getProperty(Ljava/lang/String;)Ljava/lang/String;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v11, v1}, Lwc/k1;-><init>(Landroidx/room/u;)V

    new-instance v12, Lwc/l;

    new-instance v1, Landroidx/room/u;

    const/16 v8, 0x18

    const-class v4, Lvg/n;

    const-string v5, "getenv"

    const-string v6, "getenv(Ljava/lang/String;)Ljava/lang/String;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v12, v1}, Lwc/l;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lwc/j1;

    invoke-direct {v1, p2, p1, v3}, Lwc/j1;-><init>(Ljava/lang/String;Lpf/a;Lvg/n;)V

    new-instance v2, Lwc/m0;

    invoke-direct {v2, p2, p1, v3}, Lwc/m0;-><init>(Ljava/lang/String;Lpf/a;Lvg/n;)V

    new-instance p2, Lwc/i;

    invoke-direct {p2, v3, p1}, Lwc/i;-><init>(Lvg/n;Lpf/a;)V

    new-instance p1, Lwc/s;

    new-instance v4, Lm83/p;

    const/16 v5, 0x16

    invoke-direct {v4, p0, v5}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {v4}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v4

    invoke-direct {p1, v4, v3}, Lwc/s;-><init>(Ll83/p;Lvg/n;)V

    const/4 v3, 0x6

    new-array v3, v3, [Lve/f;

    aput-object v11, v3, v0

    aput-object v12, v3, v9

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    const/4 v0, 0x4

    aput-object p2, v3, v0

    const/4 p2, 0x5

    aput-object p1, v3, p2

    invoke-direct {v10, v3}, Lve/g;-><init>([Lve/f;)V

    iput-object v10, p0, Lwc/c;->z:Lve/g;

    new-instance p1, Lve/b;

    invoke-direct {p1, v10}, Lve/b;-><init>(Lve/g;)V

    iput-object p1, p0, Lwc/c;->E:Lve/b;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwc/c;->E:Lve/b;

    invoke-virtual {v0, p1, p2}, Lve/b;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lwc/c;->E:Lve/b;

    invoke-virtual {v0}, Lve/b;->close()V

    iget-boolean v0, p0, Lwc/c;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwc/c;->y:Lpf/a;

    invoke-static {v0}, Lyf/j;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc/c;->z:Lve/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
