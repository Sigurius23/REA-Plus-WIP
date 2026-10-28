.class final Lsc0/h$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lpc0/c;


# direct methods
.method public constructor <init>(Lpc0/c;)V
    .locals 0

    iput-object p1, p0, Lsc0/h$c$a;->w:Lpc0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lqc0/a$f;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc0/a$f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lsc0/h$c$a;->w:Lpc0/c;

    invoke-virtual {p2, p1}, Lpc0/c;->a(Lqc0/a$f;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc0/a$f;

    invoke-virtual {p0, p1, p2}, Lsc0/h$c$a;->b(Lqc0/a$f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
