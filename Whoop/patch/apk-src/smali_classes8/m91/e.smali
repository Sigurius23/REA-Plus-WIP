.class public final synthetic Lm91/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lm91/d;


# direct methods
.method public synthetic constructor <init>(Lm91/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm91/e;->a:Lm91/d;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lm91/e;->a:Lm91/d;

    invoke-static {v0, p1}, Lm91/c$b$a;->b(Lm91/d;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
