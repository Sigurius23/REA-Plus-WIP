.class public Lij/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lkotlin/jvm/internal/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/p;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/p;->a:Ljava/lang/String;

    .line 3
    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lij/p;->b:Lkotlin/jvm/internal/m;

    return-void
.end method
