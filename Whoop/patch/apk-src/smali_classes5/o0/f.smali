.class public final Lo0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/q;


# instance fields
.field public final a:Lc93/m;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lx1/b;


# direct methods
.method public constructor <init>(Lc93/m;Lkotlin/jvm/functions/Function1;Lx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/f;->a:Lc93/m;

    iput-object p2, p0, Lo0/f;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lo0/f;->c:Lx1/b;

    return-void
.end method


# virtual methods
.method public final getKey()Lkotlin/jvm/functions/Function1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getType()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lo0/f;->b:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
