.class public final synthetic Ll80/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lp1/t2;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll80/h;->w:Z

    iput-boolean p2, p0, Ll80/h;->x:Z

    iput-object p3, p0, Ll80/h;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/h;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll80/h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll80/h;->F:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v0, p0, Ll80/h;->w:Z

    iget-boolean v1, p0, Ll80/h;->x:Z

    iget-object v2, p0, Ll80/h;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/h;->F:Lp1/t2;

    invoke-static/range {v0 .. v9}, Ll80/n;->A(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
