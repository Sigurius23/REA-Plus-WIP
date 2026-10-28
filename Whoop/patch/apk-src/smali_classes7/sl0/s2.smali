.class public final synthetic Lsl0/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lsl0/f;


# direct methods
.method public synthetic constructor <init>(Lsl0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/s2;->a:Lsl0/f;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lsl0/s2;->a:Lsl0/f;

    invoke-static {v0, p1}, Lsl0/u2;->a(Lsl0/f;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
