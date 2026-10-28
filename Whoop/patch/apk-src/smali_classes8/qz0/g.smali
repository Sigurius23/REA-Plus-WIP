.class public final synthetic Lqz0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:Lp1/c1;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lp1/c1;JJZLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqz0/g;->w:Lp1/c1;

    iput-wide p2, p0, Lqz0/g;->x:J

    iput-wide p4, p0, Lqz0/g;->y:J

    iput-boolean p6, p0, Lqz0/g;->z:Z

    iput-object p7, p0, Lqz0/g;->E:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v6, p0, Lqz0/g;->E:Lp1/c1;

    move-object v7, p1

    check-cast v7, Lg2/v;

    iget-object v0, p0, Lqz0/g;->w:Lp1/c1;

    iget-wide v1, p0, Lqz0/g;->x:J

    iget-wide v3, p0, Lqz0/g;->y:J

    iget-boolean v5, p0, Lqz0/g;->z:Z

    invoke-static/range {v0 .. v7}, Lqz0/k;->e(Lp1/c1;JJZLp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
