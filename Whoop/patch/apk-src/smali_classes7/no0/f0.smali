.class public final synthetic Lno0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lz1/s;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lz1/s;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno0/f0;->w:Lz1/s;

    iput-object p2, p0, Lno0/f0;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v2, p1

    check-cast v2, Lc0/o;

    move-object v3, p2

    check-cast v3, Ljava/lang/String;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lno0/f0;->w:Lz1/s;

    iget-object v1, p0, Lno0/f0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lno0/g0;->l(Lz1/s;Lkotlin/jvm/functions/Function1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
