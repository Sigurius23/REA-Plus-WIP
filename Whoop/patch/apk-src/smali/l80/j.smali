.class public final synthetic Ll80/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll80/j;->w:Z

    iput-boolean p2, p0, Ll80/j;->x:Z

    iput-object p3, p0, Ll80/j;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/j;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll80/j;->E:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Leb/q;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v0, p0, Ll80/j;->w:Z

    iget-boolean v1, p0, Ll80/j;->x:Z

    iget-object v2, p0, Ll80/j;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/j;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/j;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v8}, Ll80/n;->f(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
