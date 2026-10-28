.class public final synthetic Lzh2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzh2/e;->a:Lc93/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzh2/e;->a:Lc93/m;

    invoke-static {v0, p1, p2}, Lzh2/f;->h(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
