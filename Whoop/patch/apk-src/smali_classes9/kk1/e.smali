.class public final synthetic Lkk1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Lik1/d;


# direct methods
.method public synthetic constructor <init>(FFFLik1/d;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkk1/e;->w:F

    iput p2, p0, Lkk1/e;->x:F

    iput p3, p0, Lkk1/e;->y:F

    iput-object p4, p0, Lkk1/e;->z:Lik1/d;

    iput p5, p0, Lkk1/e;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lkk1/e;->E:F

    move-object v5, p1

    check-cast v5, Li2/g0;

    iget v0, p0, Lkk1/e;->w:F

    iget v1, p0, Lkk1/e;->x:F

    iget v2, p0, Lkk1/e;->y:F

    iget-object v3, p0, Lkk1/e;->z:Lik1/d;

    invoke-static/range {v0 .. v5}, Lkk1/g;->c(FFFLik1/d;FLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
