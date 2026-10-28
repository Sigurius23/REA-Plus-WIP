.class public abstract Lm1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Locale;

.field public final b:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/Locale;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/o;->a:Ljava/util/Locale;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lm1/o;->b:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public abstract a(J)Lm1/r;
.end method

.method public abstract b()Lm1/n;
.end method

.method public abstract c(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lm1/n;
.end method
