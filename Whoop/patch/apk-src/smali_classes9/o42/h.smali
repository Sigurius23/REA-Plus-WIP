.class public final synthetic Lo42/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZZZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lo42/h;->w:Z

    iput-boolean p2, p0, Lo42/h;->x:Z

    iput-boolean p3, p0, Lo42/h;->y:Z

    iput-object p4, p0, Lo42/h;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lo42/h;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v0, p0, Lo42/h;->w:Z

    iget-boolean v1, p0, Lo42/h;->x:Z

    iget-boolean v2, p0, Lo42/h;->y:Z

    iget-object v3, p0, Lo42/h;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lo42/h;->E:I

    invoke-static/range {v0 .. v6}, Lo42/k;->k(ZZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
