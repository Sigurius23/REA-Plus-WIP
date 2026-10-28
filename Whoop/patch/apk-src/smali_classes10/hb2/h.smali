.class public final synthetic Lhb2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:Lhb2/e;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lhb2/e;IILp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb2/h;->w:Lhb2/e;

    iput p2, p0, Lhb2/h;->x:I

    iput p3, p0, Lhb2/h;->y:I

    iput-object p4, p0, Lhb2/h;->z:Lp1/c1;

    iput-object p5, p0, Lhb2/h;->E:Lp1/c1;

    iput-object p6, p0, Lhb2/h;->F:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v5, p0, Lhb2/h;->F:Lp1/c1;

    move-object v6, p1

    check-cast v6, Lih0/d;

    iget-object v0, p0, Lhb2/h;->w:Lhb2/e;

    iget v1, p0, Lhb2/h;->x:I

    iget v2, p0, Lhb2/h;->y:I

    iget-object v3, p0, Lhb2/h;->z:Lp1/c1;

    iget-object v4, p0, Lhb2/h;->E:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lhb2/j;->b(Lhb2/e;IILp1/c1;Lp1/c1;Lp1/c1;Lih0/d;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
