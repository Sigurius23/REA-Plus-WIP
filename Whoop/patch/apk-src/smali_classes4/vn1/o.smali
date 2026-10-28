.class public final synthetic Lvn1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lm91/n;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn1/o;->w:Lm91/n;

    iput-object p2, p0, Lvn1/o;->x:Lc93/m;

    iput-object p3, p0, Lvn1/o;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Lm91/n;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lvn1/o;->w:Lm91/n;

    iget-object v1, p0, Lvn1/o;->x:Lc93/m;

    iget-object v2, p0, Lvn1/o;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lvn1/p;->c(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
