.class public final synthetic Lny0/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lp1/t2;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lny0/q;


# direct methods
.method public synthetic constructor <init>(ZZZLny0/q;JLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lny0/z0;->w:Z

    iput-boolean p2, p0, Lny0/z0;->x:Z

    iput-boolean p3, p0, Lny0/z0;->y:Z

    iput-object p4, p0, Lny0/z0;->z:Lny0/q;

    iput-wide p5, p0, Lny0/z0;->E:J

    iput-object p7, p0, Lny0/z0;->F:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v6, p0, Lny0/z0;->F:Lp1/t2;

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget-boolean v0, p0, Lny0/z0;->w:Z

    iget-boolean v1, p0, Lny0/z0;->x:Z

    iget-boolean v2, p0, Lny0/z0;->y:Z

    iget-object v3, p0, Lny0/z0;->z:Lny0/q;

    iget-wide v4, p0, Lny0/z0;->E:J

    invoke-static/range {v0 .. v7}, Lny0/b1;->a(ZZZLny0/q;JLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
