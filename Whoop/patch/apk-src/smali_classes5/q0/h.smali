.class public final Lq0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/q;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Lc93/n;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/h;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lq0/h;->b:Lc93/n;

    return-void
.end method


# virtual methods
.method public final getKey()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lq0/h;->a:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
