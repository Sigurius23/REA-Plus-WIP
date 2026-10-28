.class public final synthetic Lch0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Ljava/time/Clock;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/time/Clock;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/f0;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lch0/f0;->x:Ljava/time/Clock;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    move-object v3, p2

    check-cast v3, Ljava/util/List;

    move-object v4, p3

    check-cast v4, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v0, p0, Lch0/f0;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lch0/f0;->x:Ljava/time/Clock;

    invoke-static/range {v0 .. v5}, Lch0/m0;->u(Lkotlin/jvm/functions/Function1;Ljava/time/Clock;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
