.class public final Lyb3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Lc93/m;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILc93/m;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyb3/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, Lyb3/c;->b:I

    iput-object p3, p0, Lyb3/c;->c:Lc93/m;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lyb3/b;

    invoke-direct {v0, p0}, Lyb3/b;-><init>(Lyb3/c;)V

    return-object v0
.end method
