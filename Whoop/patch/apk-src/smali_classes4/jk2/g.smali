.class public final synthetic Ljk2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lfm1/i;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/t2;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljk2/g;->w:Lfm1/i;

    iput-object p2, p0, Ljk2/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ljk2/g;->y:Lp1/t2;

    iput-object p4, p0, Ljk2/g;->z:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v4, p1

    check-cast v4, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Ljk2/g;->w:Lfm1/i;

    iget-object v1, p0, Ljk2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ljk2/g;->y:Lp1/t2;

    iget-object v3, p0, Ljk2/g;->z:Lp1/t2;

    invoke-static/range {v0 .. v7}, Ljk2/i;->h(Lfm1/i;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
