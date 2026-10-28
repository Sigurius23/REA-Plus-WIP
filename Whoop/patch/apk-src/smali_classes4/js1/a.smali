.class public final synthetic Ljs1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Lh11/h;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lh11/h;Lkotlin/jvm/functions/Function1;ZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljs1/a;->w:Lh11/h;

    iput-object p2, p0, Ljs1/a;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Ljs1/a;->y:Z

    iput-boolean p4, p0, Ljs1/a;->z:Z

    iput p5, p0, Ljs1/a;->E:I

    iput p6, p0, Ljs1/a;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Ljs1/a;->w:Lh11/h;

    iget-object v1, p0, Ljs1/a;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Ljs1/a;->y:Z

    iget-boolean v3, p0, Ljs1/a;->z:Z

    iget v4, p0, Ljs1/a;->E:I

    iget v5, p0, Ljs1/a;->F:I

    invoke-static/range {v0 .. v7}, Ljs1/e;->g(Lh11/h;Lkotlin/jvm/functions/Function1;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
