.class public final synthetic Lj31/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lkotlin/jvm/internal/f0;

.field public final synthetic x:Lkotlin/jvm/internal/d0;

.field public final synthetic y:Lj31/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj31/n;->w:Lkotlin/jvm/internal/f0;

    iput-object p2, p0, Lj31/n;->x:Lkotlin/jvm/internal/d0;

    iput-object p3, p0, Lj31/n;->y:Lj31/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lj31/n;->w:Lkotlin/jvm/internal/f0;

    iget-object v2, p0, Lj31/n;->x:Lkotlin/jvm/internal/d0;

    iget-object v3, p0, Lj31/n;->y:Lj31/m;

    invoke-static {p1, v2, v3, v0, v1}, Lj31/m$b;->f(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/d0;Lj31/m;J)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
