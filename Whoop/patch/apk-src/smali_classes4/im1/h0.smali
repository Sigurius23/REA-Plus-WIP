.class public final synthetic Lim1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lim1/d0;

.field public final synthetic F:Lfm1/d;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic w:Lm91/u;

.field public final synthetic x:Lfm1/f;

.field public final synthetic y:Lf0/r1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lm91/u;Lfm1/f;Lf0/r1;ZLim1/d0;Lfm1/d;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/h0;->w:Lm91/u;

    iput-object p2, p0, Lim1/h0;->x:Lfm1/f;

    iput-object p3, p0, Lim1/h0;->y:Lf0/r1;

    iput-boolean p4, p0, Lim1/h0;->z:Z

    iput-object p5, p0, Lim1/h0;->E:Lim1/d0;

    iput-object p6, p0, Lim1/h0;->F:Lfm1/d;

    iput-object p7, p0, Lim1/h0;->G:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lim1/h0;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lim1/h0;->w:Lm91/u;

    iget-object v1, p0, Lim1/h0;->x:Lfm1/f;

    iget-object v2, p0, Lim1/h0;->y:Lf0/r1;

    iget-boolean v3, p0, Lim1/h0;->z:Z

    iget-object v4, p0, Lim1/h0;->E:Lim1/d0;

    iget-object v5, p0, Lim1/h0;->F:Lfm1/d;

    iget-object v6, p0, Lim1/h0;->G:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lim1/h0;->H:I

    invoke-static/range {v0 .. v9}, Lim1/j0;->a(Lm91/u;Lfm1/f;Lf0/r1;ZLim1/d0;Lfm1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
