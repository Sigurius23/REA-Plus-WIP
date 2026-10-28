.class public final synthetic Lpj2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Lnj2/q;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lnj2/q;ZZZLc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/n;->w:Lnj2/q;

    iput-boolean p2, p0, Lpj2/n;->x:Z

    iput-boolean p3, p0, Lpj2/n;->y:Z

    iput-boolean p4, p0, Lpj2/n;->z:Z

    iput-object p5, p0, Lpj2/n;->E:Lc93/a;

    iput-object p6, p0, Lpj2/n;->F:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lpj2/n;->G:I

    iput p8, p0, Lpj2/n;->H:I

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

    iget-object v0, p0, Lpj2/n;->w:Lnj2/q;

    iget-boolean v1, p0, Lpj2/n;->x:Z

    iget-boolean v2, p0, Lpj2/n;->y:Z

    iget-boolean v3, p0, Lpj2/n;->z:Z

    iget-object v4, p0, Lpj2/n;->E:Lc93/a;

    iget-object v5, p0, Lpj2/n;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lpj2/n;->G:I

    iget v7, p0, Lpj2/n;->H:I

    invoke-static/range {v0 .. v9}, Lpj2/q;->o(Lnj2/q;ZZZLc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
