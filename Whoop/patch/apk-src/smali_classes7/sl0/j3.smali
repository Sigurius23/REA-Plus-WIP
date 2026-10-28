.class public final synthetic Lsl0/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFLp1/c1;FJLp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsl0/j3;->w:F

    iput p2, p0, Lsl0/j3;->x:F

    iput-object p3, p0, Lsl0/j3;->y:Lp1/c1;

    iput p4, p0, Lsl0/j3;->z:F

    iput-wide p5, p0, Lsl0/j3;->E:J

    iput-object p7, p0, Lsl0/j3;->F:Lp1/c1;

    iput-object p8, p0, Lsl0/j3;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v7, p0, Lsl0/j3;->G:Lp1/c1;

    move-object v8, p1

    check-cast v8, Lk2/e;

    iget v0, p0, Lsl0/j3;->w:F

    iget v1, p0, Lsl0/j3;->x:F

    iget-object v2, p0, Lsl0/j3;->y:Lp1/c1;

    iget v3, p0, Lsl0/j3;->z:F

    iget-wide v4, p0, Lsl0/j3;->E:J

    iget-object v6, p0, Lsl0/j3;->F:Lp1/c1;

    invoke-static/range {v0 .. v8}, Lsl0/l3;->b(FFLp1/c1;FJLp1/c1;Lp1/c1;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
