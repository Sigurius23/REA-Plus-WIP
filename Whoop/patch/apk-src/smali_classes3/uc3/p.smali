.class public final Luc3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc3/k;


# instance fields
.field public final a:Lrq0/x;


# direct methods
.method public constructor <init>(Lrq0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc3/p;->a:Lrq0/x;

    return-void
.end method


# virtual methods
.method public final a(Luc3/b;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Luc3/p;->a:Lrq0/x;

    invoke-virtual {p2, p1}, Lrq0/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
