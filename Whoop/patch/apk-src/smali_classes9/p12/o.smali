.class public final synthetic Lp12/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lv41/f$a;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp12/o;->w:Lbc3/c0;

    iput-object p2, p0, Lp12/o;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lp12/o;->y:Lv41/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp12/o;->y:Lv41/f$a;

    check-cast p1, Lp12/e;

    iget-object v1, p0, Lp12/o;->w:Lbc3/c0;

    iget-object v2, p0, Lp12/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lp12/x;->x(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lp12/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
