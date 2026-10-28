.class public final Lyi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lxi/f;

.field public final c:Lxi/a;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lxi/f;Lxi/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lyi/a;->b:Lxi/f;

    iput-object p3, p0, Lyi/a;->c:Lxi/a;

    iput-boolean p4, p0, Lyi/a;->d:Z

    iput-boolean p5, p0, Lyi/a;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/f;

    invoke-direct {p2, p1, p3, p0}, Lsi/f;-><init>(Lqi/w;Lzi/b;Lyi/a;)V

    return-object p2
.end method
