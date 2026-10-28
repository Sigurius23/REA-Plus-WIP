.class final Lqu2/h$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqu2/h$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lou2/b;

.field final synthetic x:Z


# direct methods
.method public constructor <init>(Lou2/b;Z)V
    .locals 0

    iput-object p1, p0, Lqu2/h$j$a;->w:Lou2/b;

    iput-boolean p2, p0, Lqu2/h$j$a;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lhu2/a$k;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu2/a$k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object p2, p0, Lqu2/h$j$a;->w:Lou2/b;

    iget-boolean v0, p0, Lqu2/h$j$a;->x:Z

    invoke-virtual {p2, p1, v0}, Lou2/b;->a(Lhu2/a$k;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhu2/a$k;

    invoke-virtual {p0, p1, p2}, Lqu2/h$j$a;->b(Lhu2/a$k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
