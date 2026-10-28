.class public abstract Llb3/s0;
.super Llb3/y0;
.source "SourceFile"


# static fields
.field public static final b:Llb3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llb3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Llb3/s0;->b:Llb3/d;

    return-void
.end method


# virtual methods
.method public final d(Llb3/y;)Llb3/u0;
    .locals 0

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-virtual {p0, p1}, Llb3/s0;->g(Llb3/q0;)Llb3/u0;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(Llb3/q0;)Llb3/u0;
.end method
