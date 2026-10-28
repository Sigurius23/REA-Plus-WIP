.class public final synthetic Lj31/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj31/g;->w:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj31/g;->w:Lc93/m;

    check-cast p1, Lu2/r;

    invoke-static {v0, p1}, Lj31/h$a;->f(Lc93/m;Lu2/r;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
