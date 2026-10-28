.class public final Lyi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lxi/b;

.field public final c:Lxi/b;

.field public final d:Lxi/e;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lxi/b;Lxi/b;Lxi/e;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lyi/j;->b:Lxi/b;

    iput-object p3, p0, Lyi/j;->c:Lxi/b;

    iput-object p4, p0, Lyi/j;->d:Lxi/e;

    iput-boolean p5, p0, Lyi/j;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/p;

    invoke-direct {p2, p1, p3, p0}, Lsi/p;-><init>(Lqi/w;Lzi/b;Lyi/j;)V

    return-object p2
.end method
