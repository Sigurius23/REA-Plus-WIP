.class public final synthetic Ll80/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lc93/r;

.field public final synthetic w:Lq80/d;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lq80/d;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll80/a;->w:Lq80/d;

    iput-object p2, p0, Ll80/a;->x:Lc93/m;

    iput-object p3, p0, Ll80/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll80/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll80/a;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ll80/a;->G:Lc93/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v7, p1

    check-cast v7, Lc0/o;

    move-object v8, p2

    check-cast v8, Leb/q;

    move-object v9, p3

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Ll80/a;->w:Lq80/d;

    iget-object v1, p0, Ll80/a;->x:Lc93/m;

    iget-object v2, p0, Ll80/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/a;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ll80/a;->G:Lc93/r;

    invoke-static/range {v0 .. v10}, Ll80/b;->a(Lq80/d;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
