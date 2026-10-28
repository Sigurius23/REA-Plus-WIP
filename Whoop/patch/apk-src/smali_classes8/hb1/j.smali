.class public final synthetic Lhb1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lhb1/o;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lhb1/o;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb1/j;->w:Lhb1/o;

    iput-object p2, p0, Lhb1/j;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhb1/j;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Lhb1/j;->w:Lhb1/o;

    invoke-static {v1, v0, p1}, Lhb1/m;->c(Lhb1/o;Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
