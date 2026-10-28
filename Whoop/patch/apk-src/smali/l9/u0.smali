.class public final Ll9/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b0;


# instance fields
.field public final a:Lz8/e;

.field public final b:Lcom/whoop/data/repositories/c;

.field public final c:Lg9/b;

.field public final d:Ljc/b;

.field public final e:I


# direct methods
.method public constructor <init>(Lz8/e;Lt9/l;)V
    .locals 3

    new-instance v0, Lcom/whoop/data/repositories/c;

    const/16 v1, 0x11

    invoke-direct {v0, p2, v1}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lg9/b;

    invoke-direct {p2}, Lg9/b;-><init>()V

    new-instance v1, Ljc/b;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ljc/b;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/u0;->a:Lz8/e;

    iput-object v0, p0, Ll9/u0;->b:Lcom/whoop/data/repositories/c;

    iput-object p2, p0, Ll9/u0;->c:Lg9/b;

    iput-object v1, p0, Ll9/u0;->d:Ljc/b;

    const/high16 p1, 0x100000

    iput p1, p0, Ll9/u0;->e:I

    return-void
.end method


# virtual methods
.method public final b(Lu8/x;)Ll9/a;
    .locals 9

    iget-object v0, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll9/v0;

    iget-object v0, p0, Ll9/u0;->c:Lg9/b;

    invoke-virtual {v0, p1}, Lg9/b;->b(Lu8/x;)Lg9/h;

    move-result-object v5

    iget v7, p0, Ll9/u0;->e:I

    const/4 v8, 0x0

    iget-object v3, p0, Ll9/u0;->a:Lz8/e;

    iget-object v4, p0, Ll9/u0;->b:Lcom/whoop/data/repositories/c;

    iget-object v6, p0, Ll9/u0;->d:Ljc/b;

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll9/v0;-><init>(Lu8/x;Lz8/e;Lcom/whoop/data/repositories/c;Lg9/h;Ljc/b;ILu8/p;)V

    return-object v1
.end method
